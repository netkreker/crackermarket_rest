const method = "GET";
const URL = "http://localhost:8080/category";

let parameter;
const categoryBtn = document.getElementById("categoryBtn").addEventListener("click", function() {
    getPosts(response => {
        let categories = response;
        console.log(categories);
        console.log(categories[0].parameters);

        let table = document.getElementById('myTable')

        for (let i = 0; i < categories.length; i++){
            let row = `<tr>
							<td>${categories[i].id}</td>
							<td>${categories[i].name}</td>
							<td>${categories[i].parentCategory}</td>
					  </tr>`
            table.innerHTML += row
        }
    });
});


function getPosts(cb) {
    const xhr = new XMLHttpRequest();
    xhr.open(method, URL);
    xhr.addEventListener("load", () => {
        const response = JSON.parse(xhr.responseText);
        cb(response)
    });
    xhr.send();
}

