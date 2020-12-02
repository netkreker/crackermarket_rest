// const method = "GET";
// const URL = "http://localhost:8080/category";
// const xhr = new XMLHttpRequest();
// xhr.open(method, URL);
// xhr.addEventListener("load", () => {
// console.log(xhr.responseText) });



var categoryBtn = document.getElementById("categoryBtn").addEventListener("click", function() {
    getCategories("GET", "http://localhost:8080/category");
});


function getCategories(method, URL) {
    const xhr = new XMLHttpRequest();
    xhr.open(method, URL);
    xhr.addEventListener("load", () => {
    console.log(xhr.responseText) });
    xhr.send();
}