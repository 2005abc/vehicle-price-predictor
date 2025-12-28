document.addEventListener('DOMContentLoaded', () => {

    const vehicleBrands2025 = {
        car: ["Maruti Suzuki", "Hyundai", "Tata", "Mahindra", "Toyota", "Honda", "Kia", "Volkswagen", "Skoda", "Renault", "Nissan", "MG", "BYD", "Jeep", "BMW", "Mercedes", "Audi", "Volvo", "Jaguar", "Land Rover"],
        bike: ["Bajaj", "Hero", "Honda", "TVS", "Royal Enfield", "Yamaha", "KTM", "Suzuki", "Jawa", "Ola", "Ather", "Benelli", "Kawasaki", "Triumph"],
        scooter: ["Honda", "TVS", "Bajaj", "Suzuki", "Yamaha", "Hero", "Ola", "Ather", "Vespa"],
        truck: ["Tata", "Ashok Leyland", "Mahindra", "BharatBenz", "Eicher", "Volvo", "Scania"],
        bus: ["Tata", "Ashok Leyland", "Volvo", "Eicher", "Mahindra", "BharatBenz", "BYD"],
        tractor: ["Mahindra", "Sonalika", "TAFE", "Escorts", "John Deere", "New Holland", "Kubota", "CNH", "Force"],
        other: ["Other Brand"]
    };

    const vehicleTypeSelect = document.getElementById('vehicleType');
    const makeSelect = document.getElementById('make');
    const form = document.getElementById('vehicleForm');
    const resultDiv = document.getElementById('result');

    vehicleTypeSelect.addEventListener('change', function() {
        const vehicleType = this.value;
        makeSelect.innerHTML = '<option value="">Select Brand</option>';
        if (vehicleType && vehicleBrands2025[vehicleType]) {
            vehicleBrands2025[vehicleType].forEach(make => {
                const option = document.createElement('option');
                option.value = make;
                option.textContent = make;
                makeSelect.appendChild(option);
            });
        }
    });

    form.addEventListener('submit', function(e) {
        e.preventDefault();


        const requestData = {
            vehicleType: document.getElementById('vehicleType').value,
            brand: document.getElementById('make').value,
            model: "Standard",
            year: parseInt(document.getElementById('year').value),
            mileage: parseInt(document.getElementById('mileage').value),
            condition: document.getElementById('condition').value,
            fuelType: document.getElementById('fuelType').value,
            engineSize: parseInt(document.getElementById('engineSize').value)
        };

        console.log("Sending data to backend:", requestData);


        fetch('/api/predict', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(requestData)
        })
        .then(response => {
            if (!response.ok) throw new Error("Server error");
            return response.json();
        })
        .then(data => {

            displayResult(data);
            console.log("Saved to DB!");
        })
        .catch(error => {
            console.error("Error:", error);
            alert("Could not connect to Backend. Is Spring Boot running?");
        });
    });

    function displayResult(data) {
        document.getElementById('predictedPrice').textContent = data.predictedPrice.toLocaleString('en-IN');
        document.getElementById('trendNote').textContent = "Saved to Database!";
        resultDiv.style.display = 'block';
        resultDiv.scrollIntoView({ behavior: 'smooth', block: 'nearest' });
    }
});