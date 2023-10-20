const textDisplay = document.getElementById('text-display');
const userInput = document.getElementById('user-input');
const message = document.getElementById('message');

// Text to be typed by the user
const textToType = "Le texte à saisir apparaîtra ici.";

// Display the initial text
textDisplay.innerText = textToType;

// Listen for user input
userInput.addEventListener('input', function () {
    const typedText = userInput.value;
    if (textToType.startsWith(typedText)) {
        message.textContent = "Bonne saisie!";
        if (typedText === textToType) {
            message.style.color = "green";
            userInput.disabled = true;
        }
    } else {
        message.textContent = "Mauvaise saisie";
        message.style.color = "red";
    }
});

