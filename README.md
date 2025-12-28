<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vehicle Price Predictor</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: #0f172a;
            color: #e5e7eb;
            line-height: 1.7;
            padding: 30px;
        }
        h1, h2, h3 {
            color: #38bdf8;
        }
        code {
            background: #1e293b;
            padding: 4px 6px;
            border-radius: 4px;
            color: #a5f3fc;
        }
        pre {
            background: #020617;
            padding: 16px;
            border-radius: 8px;
            overflow-x: auto;
        }
        ul {
            margin-left: 20px;
        }
        img {
            max-width: 100%;
            border-radius: 10px;
            border: 1px solid #334155;
            margin-top: 15px;
        }
        .container {
            max-width: 950px;
            margin: auto;
        }
        hr {
            border: 0;
            border-top: 1px solid #334155;
            margin: 30px 0;
        }
    </style>
</head>
<body>
<div class="container">

    <h1>🚗 Vehicle Price Predictor</h1>

    <p>
        A <strong>Java Spring Boot web application</strong> that estimates the market price of vehicles
        based on user inputs such as brand, model, manufacturing year, mileage, fuel type, engine capacity,
        and vehicle condition.
    </p>

    <p>
        The application follows a <strong>layered backend architecture</strong> and stores prediction history
        in a <strong>MySQL database</strong>.
    </p>

    <hr>

    <h2>✨ Key Features</h2>
    <ul>
        <li>Vehicle price estimation using rule-based logic</li>
        <li>REST API built with Spring Boot</li>
        <li>Prediction history stored in MySQL</li>
        <li>Clean and responsive frontend UI</li>
        <li>Proper Controller–Service–Repository separation</li>
    </ul>

    <hr>

    <h2>🛠 Tech Stack</h2>

    <h3>Backend</h3>
    <ul>
        <li>Java (JDK 21)</li>
        <li>Spring Boot (4.0.0)</li>
        <li>Spring Data JPA</li>
        <li>Maven</li>
    </ul>

    <h3>Database</h3>
    <ul>
        <li>MySQL</li>
    </ul>

    <h3>Frontend</h3>
    <ul>
        <li>HTML5</li>
        <li>CSS3</li>
        <li>JavaScript</li>
    </ul>

    <h3>Tools</h3>
    <ul>
        <li>IntelliJ IDEA</li>
        <li>Git & GitHub</li>
    </ul>

    <hr>

    <h2>📂 Project Structure</h2>

    <pre>
vehicle-price-predictor/
│
├── src/main/java/com/vinay/predictor/
│   ├── controller/
│   │   └── PredictionController.java
│   ├── service/
│   │   └── PricePredictionService.java
│   ├── repository/
│   │   └── PredictionRepository.java
│   ├── model/
│   │   ├── VehicleRequest.java
│   │   ├── PredictionResponse.java
│   │   └── PredictionHistory.java
│   └── VehiclePricePredictorApplication.java
│
├── src/main/resources/
│   ├── static/
│   │   ├── css/style.css
│   │   └── js/app.js
│   ├── templates/
│   │   └── index.html
│   └── application.properties
│
├── screenshots/
│   └── ui.png
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.html
    </pre>

    <hr>

    <h2>▶️ How to Run the Project</h2>

    <h3>Prerequisites</h3>
    <ul>
        <li>Java JDK 21</li>
        <li>Maven</li>
        <li>MySQL</li>
        <li>Git</li>
    </ul>

    <h3>Steps</h3>
    <pre>
git clone https://github.com/&lt;your-username&gt;/vehicle-price-predictor.git
cd vehicle-price-predictor
mvn spring-boot:run
    </pre>

    <p>Application will be available at:</p>
    <code>http://localhost:8080</code>

    <hr>

    <h2>🚀 Future Improvements</h2>
    <ul>
        <li>Advanced pricing logic</li>
        <li>Authentication & user roles</li>
        <li>Analytics dashboard</li>
        <li>Cloud deployment</li>
    </ul>

    <hr>

    

    <hr>

    <h2>📸 Application Screenshot</h2>
    <p>Actual UI of the running application:</p>
    <img src="<img width="1000" height="500" alt="Screenshot (47)" src="https://github.com/user-attachments/assets/f36afeff-ebb2-4872-b264-797e63ade9c7" />
" alt="">

    <hr>

</div>
</body>
</html>
