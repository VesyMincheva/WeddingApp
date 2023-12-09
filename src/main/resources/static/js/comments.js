let storyId = document.getElementById("storyId").getAttribute("value");
let container = document.getElementById("commentContainer");
fetch(`http://localhost:8080/api/${storyId}/comments`)
.then((res) => res.json())
.then((body) => {
    for (comment of body){
        let divContainer = document.createElement("div");
        container.appendChild(divContainer);
        let text = document.createElement("p");
        text.textContent = comment.content
        divContainer.appendChild(text);
        let created = document.createElement("p");
        created.textContent = comment.created;
        divContainer.appendChild(created);
        let createdBy = document.createElement("p");
        createdBy.textContent = comment.createdBy;
        divContainer.appendChild(createdBy);
    }
});