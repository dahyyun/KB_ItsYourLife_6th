<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>오늘의 날씨</title>
    <style>
        .weather-container {
            max-width: 500px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 10px;
            text-align: center;
        }

        .weather-icon {
            vertical-align: middle;
        }

        .temperature {
            font-size: 24px;
            font-weight: bold;
            color: #2c3e50;
        }
    </style>
</head>
<body>
<div class="weather-container">
    <h2>${city} 날씨</h2>

    <!-- 날씨 상태와 아이콘 -->
    <div>
        오늘의 날씨: ${weather.weather[0].description}
        <img src="${iconUrl}" class="weather-icon" alt="날씨 아이콘"/>
    </div>

    <!-- 온도와 습도 정보 -->
    <div class="temperature">
        온도: ${weather.main.temp}°C / 습도: ${weather.main.humidity}%
    </div>

    <!-- 추가 정보 -->
    <div style="margin-top: 20px;">
        <p>체감온도: ${weather.main.feelsLike}°C</p>
        <p>최저/최고: ${weather.main.tempMin}°C / ${weather.main.tempMax}°C</p>
        <p>기압: ${weather.main.pressure}hPa</p>
        <p>풍속: ${weather.wind.speed}m/s</p>
    </div>
</div>
</body>
</html>