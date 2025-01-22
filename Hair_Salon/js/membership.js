document.getElementById('rewards-form').addEventListener('submit', function (event) {
    const fullname = document.getElementById('fullname').value.trim();
    const phone = document.getElementById('phone').value.trim();
    const membership = document.getElementById('membership').value;
    const phoneRegex = /^\d{10}$/;
    if (!phoneRegex.test(phone)) {
        alert("Please enter a valid 10-digit phone number.");
        return;
    }
    event.preventDefault();
    alert('Thank you for being a part of our rewards program!');
    

    // Validate phone number (10 digits)
    
   
});