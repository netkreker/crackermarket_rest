const method = "GET";
const URL = "http://localhost:8080/category";

let parameter;
const categoryBtn = document.getElementById("categoryBtn").addEventListener("click", function() {
    getPosts(response => {
        let categories = response;
        console.log(categories);
        console.log(categories[0].parameters);


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


