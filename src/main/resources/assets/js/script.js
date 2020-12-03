document.getElementById("categoryBtn").addEventListener("click", function() {
    getCategories("GET", "http://localhost:8085/category");
});
function getCategories(method, URL) {
    const xhr = new XMLHttpRequest();
    xhr.open(method, URL);
    xhr.addEventListener("load", () => {
    let categories = JSON.parse(xhr.responseText);
        buildCategoryTable(categories)
    });
    xhr.send();
}


function buildCategoryTable(data){
    let body = document.body;
    let table = document.createElement('table');
    table.className = "table table-striped";
    table.id = "myTable";
    body.appendChild(table);
    let tableHeader = `
        <tr  class="bg-info">
            <th>Category ID</th>
            <th>Name</th>
            <th>Parent category</th>
            <th>Parameters</th>
        </tr>
        <tbody id="myTable">
        </tbody>`

    let catTable = document.getElementById('myTable')
    catTable.innerHTML += tableHeader;

    for (let i = 0; i < data.length; i++){
        let row = `<tr>
							<td>${data[i].id}</td>
							<td>${data[i].name}</td>
							<td>${data[i].parentCategory}</td>
							<td><select>
						    ${createOptions(data[i].parameters)}
                            </select></td>
					  </tr>`
        catTable.innerHTML += row;
    }

    function createOptions(data) {
        let options = "";
        for(let i = 0; i < data.length; i ++) {
            options += `<option>${data[i].name}</option>`;
        }
        return options;
    }
}