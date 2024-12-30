document.addEventListener("DOMContentLoaded", function() {
  const container = document.querySelector('.container');
  const leftButton = document.querySelector('.left');
  const rightButton = document.querySelector('.right');

  // Get the width of one card plus margin to use for scrolling
  const cardWidth = document.querySelector('.card').offsetWidth + 40; // 40px is the margin-right

  // Scroll to the right when the right button is clicked
  rightButton.addEventListener('click', function() {
      container.scrollBy({
          left: cardWidth, 
          behavior: 'smooth'
      });
  });

  // Scroll to the left when the left button is clicked
  leftButton.addEventListener('click', function() {
      container.scrollBy({
          left: -cardWidth, 
          behavior: 'smooth'
      });
  });
});
