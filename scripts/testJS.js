
$( document ).ready(function() {
    $("#btn").click(



        function(){
            

                var searchText = document.getElementById("input").value;

                var queryText = "https://api.themoviedb.org/3/search/movie?api_key=d272326e467344029e68e3c4ff0b4059&language=ru-RU&query=" + searchText;

                $.ajax({
                    url: queryText
                }).then(function (data) {
                    try {

                        alert(data.results[1].json());


                    }catch (e) {
                        window.open("https://stackoverflow.com/search?q=[js]+" + e);
                    }
                });


/*

* 
*
*
*
* */


            return false;
        }
    );
});

function addRow(firstColumn,secondColumn ) {

    var resultTable = document.getElementById("results");
    var tableRow = document.createElement("tr");
    var tableData = document.createElement("td");
    tableData.innerText = "1";
    tableRow.appendChild(tableData);
    tableData = document.createElement("td");
    tableData.innerText = "2";
    tableRow.appendChild(tableData);
    resultTable.appendChild(tableRow);



}