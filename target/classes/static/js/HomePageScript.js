// Get search input and button elements
const searchField = document.getElementById('search-field');
const searchButton = document.getElementById('search-btn');
const clearButton = document.getElementById('clear-search');

// Function to filter artist cards based on search input
function filterArtists() {
  const query = searchField.value.trim().toLowerCase(); // Normalize user input

  // Make an AJAX request to the server to search for artists
  fetch(`/search?name=${encodeURIComponent(query)}`)
    .then(response => response.json())
    .then(data => {
      // Hide all artist cards initially
      artistCards.forEach(card => {
        card.classList.add('hidden');
        card.classList.remove('highlight');
      });

      // Loop through the returned data to match and show artist cards
      data.forEach(artist => {
        const card = document.querySelector(`.artist-card[data-name="${artist.name.toLowerCase()}"]`);
        if (card) {
          card.classList.remove('hidden');
          card.classList.add('highlight');
        }
      });

      // Check if any visible cards found
      const visibleCards = document.querySelectorAll('.artist-card:not(.hidden)');
      if (visibleCards.length === 0 && query !== '') {
        alert('No artists found. Please try a different search term.');
      }
    })
    .catch(error => {
      console.error('Error fetching search results:', error);
    });
}

// Event listener for search button
searchButton.addEventListener('click', filterArtists);

// Real-time search functionality for input changes
searchField.addEventListener('input', filterArtists);

// Event listener for Clear Search button
clearButton.addEventListener('click', () => {
  searchField.value = ''; // Clear input field
  artistCards.forEach(card => {
    // Remove hidden and highlight classes to display all cards
    card.classList.remove('hidden', 'highlight');
  });
});

let slideIndex = 1; // Start with the first slide
showSlides(slideIndex);

function showSlides(n) {
  let slides = document.getElementsByClassName("mySlides");
  let dots = document.getElementsByClassName("dot");

  // Handle edge cases for slide index
  if (n > slides.length) slideIndex = 1;
  if (n < 1) slideIndex = slides.length;

  // Hide all slides and remove active dot class
  for (let i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  for (let i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }

  // Show the current slide and set its dot as active
  slides[slideIndex - 1].style.display = "block";
  dots[slideIndex - 1].className += " active";
}

// Auto-slide every 3 seconds
setInterval(() => {
  slideIndex++;
  showSlides(slideIndex);
}, 4000); // Change image every 3 seconds

// Function to navigate to a specific slide with index
function currentSlide(n) {
  showSlides((slideIndex = n));
}
