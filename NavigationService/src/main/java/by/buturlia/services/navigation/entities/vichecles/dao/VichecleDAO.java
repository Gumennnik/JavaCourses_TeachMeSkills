package by.buturlia.services.navigation.entities.vichecles.dao;

import by.buturlia.services.navigation.db.MySqlConnection;
import by.buturlia.services.navigation.entities.CrudDAO;
import by.buturlia.services.navigation.entities.vichecles.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VichecleDAO implements CrudDAO<Vichecle> {

    private static final String CREATE_VICHECLE= "";
    private static final String SELECT_ALL_VICHECLES = "SELECT v.id, v.vichecle_name , v.vichecle_speed , v.vichecle_people_count, v.vichecle_cargo_count ,v.vichecle_pricing , vt.vichecle_type_name , vt.id AS vichecle_type_id  FROM vichecles AS v , vichecle_type AS vt WHERE v.vichecle_type_id = vt.id";
    private static final String UPDATE = "";

    @Override
    public void create(Vichecle vichecle) {

    }

    @Override
    public void update(Vichecle vichecle) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Vichecle> get() throws Exception {

        ArrayList<Vichecle> vichecleArrayList = new ArrayList<>();

        try (Connection connection = MySqlConnection.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_VICHECLES);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                String vichecleTypeName = "";
                Vichecle vichecle;
                try {
                    vichecleTypeName = resultSet.getString("vichecle_type_name");
                    switch (vichecleTypeName) {
                        case "ground":
                            vichecle = new GroundVichecle();
                            break;
                        case "air":
                            vichecle = new AirVichecle();
                            break;
                        case "sea":
                            vichecle = new SeaVichecle();
                            break;
                        default:
                            continue;
                    }

                    vichecle.setId(resultSet.getInt("id"));
                    vichecle.setVichecleName(resultSet.getString("vichecle_name"));
                    vichecle.setSpeed(resultSet.getInt("vichecle_speed"));
                    vichecle.setPeopleCount(resultSet.getInt("vichecle_people_count"));
                    vichecle.setCargoCount(resultSet.getInt("vichecle_cargo_count"));
                    vichecle.setPriceForKilometer(resultSet.getInt("vichecle_pricing"));



                } catch (Exception e) {
                    e.printStackTrace();
                    continue;
                }

                vichecleArrayList.add(vichecle);




            }


        }

        return vichecleArrayList;
    }
}
