let button = document.getElementById("button");
let image = document.getElementById("image");
let pokeNumber = document.getElementById("number");
let pokeName = document.getElementById("name");

// I'll become intelligent by God's grace
const changePokemon = async () => {
    let randomNumber = Math.ceil(Math.random() * 150) + 1;

    let requestString = `https://pokeapi.co/api/v2/pokemon/${randomNumber}`;

    // fetch returns the answer
    let data = await fetch(requestString);

    console.log(data);

    let response = await data.json();
    console.log(response);

    image.src = response.sprites.front_default;
    pokeNumber.textContent = `#${response.id}`;
    pokeName.textContent = response.name;
};

changePokemon();

button.addEventListener("click", changePokemon);