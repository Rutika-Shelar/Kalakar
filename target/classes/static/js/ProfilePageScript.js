document.addEventListener("DOMContentLoaded", function () {
    const followBtn = document.querySelector(".follow-btn");

  
    const navLinks = document.querySelectorAll(".navbar nav ul li");
    navLinks.forEach(link => {
        link.addEventListener("click", function () {
            alert("Navigating to " + link.textContent);
        });
    });
});

document.addEventListener("DOMContentLoaded", function () {
    const addArtworksBtn = document.querySelector(".add-artworks-btn");
    const uploadPopup = document.getElementById("uploadPopup");
    const closeBtn = document.querySelector(".close-btn");

    addArtworksBtn.addEventListener("click", function () {
        uploadPopup.style.display = "block";
    });

    closeBtn.addEventListener("click", function () {
        uploadPopup.style.display = "none";
    });

    window.addEventListener("click", function (event) {
        if (event.target == uploadPopup) {
            uploadPopup.style.display = "none";
        }
    });
});


document.addEventListener('DOMContentLoaded', () => {
    const editIcon = document.querySelector('.edit-icon-container');
    const editProfilePopup = document.getElementById('editProfilePopup');
    const closeBtn = editProfilePopup.querySelector('.close-btn');

    editIcon.addEventListener('click', () => {
        editProfilePopup.style.display = 'block';
    });

    closeBtn.addEventListener('click', () => {
        editProfilePopup.style.display = 'none';
    });

    window.addEventListener('click', (event) => {
        if (event.target === editProfilePopup) {
            editProfilePopup.style.display = 'none';
        }
    });
});
