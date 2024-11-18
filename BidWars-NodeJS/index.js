import axios from "axios";

const BASE_URL = "http://127.0.0.1:8080"
const randomCar = await axios.get(`${BASE_URL}/api/car`);

console.log(`Random car: ${randomCar.data}`);