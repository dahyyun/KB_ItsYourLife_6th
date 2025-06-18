package org.scoula.weather.controller;

import lombok.extern.slf4j.Slf4j;
import org.scoula.weather.dto.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@Slf4j
@RequestMapping("/weather")
@PropertySource({"classpath:/application.properties"})
public class WeatherController {

    // application.properties에서 값 주입
    @Value("${weather.url}")
    private String URL;

    @Value("${weather.icon_url}")
    private String ICON_URL;

    @Value("${weather.api_key}")
    private String API_KEY;


    @GetMapping({"", "/{city}"})
    public String weather(Model model,
                          @PathVariable(value = "city", required = false) String city) {

        // 기본값 설정: 도시명이 없으면 서울로 설정
        city = city == null ? "seoul" : city;

        // RestTemplate 인스턴스 생성
        RestTemplate restTemplate = new RestTemplate();

        // UriComponentsBuilder로 URL 구성
        String url = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("q", city)           // 도시명
                .queryParam("units", "metric")   // 섭씨 온도
                .queryParam("APPID", API_KEY)    // API 키
                .queryParam("lang", "kr")        // 한국어
                .toUriString();

        // API 호출 및 응답 받기
        WeatherDTO weather = restTemplate.getForObject(url, WeatherDTO.class);

        // 아이콘 URL 생성
        String iconUrl = ICON_URL.formatted(
                weather.getWeather().get(0).getIcon()
        );

        // 로그 출력
        log.info("오늘의 날씨: " + weather);

        // 모델에 데이터 추가
        model.addAttribute("city", city);
        model.addAttribute("weather", weather);
        model.addAttribute("iconUrl", iconUrl);

        return "weather/today";
    }

}