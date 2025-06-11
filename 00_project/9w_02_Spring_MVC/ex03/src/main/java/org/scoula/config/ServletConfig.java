package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//MVC 관련된 설정이나 객체생성 + 주입
@EnableWebMvc //MVC관련된 설정을 할 수 있는 파일로 등록
@ComponentScan(basePackages = {"org.scoula"}) //SpringMVC 컴포넌트 등록을 위한 스캔 패키지
public class ServletConfig implements WebMvcConfigurer {
    //어떤 함수를 써서 설정해야할지 이미 WebMvcConfigurer에 정의되어 있음
    //재정의(Override) 해서 내 상황에 맞게 정의해주면 됨.

    //프론트파일(css, js, img)의 위치를 지정해주는 함수
    // /resources/img/a.png라고 요청이 들어오면
    // /resources/ 밑에서 찾겠다는 설정
    // <img src="/resources/img/a.png">
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**") // url이 /resources/로 시작하는 모든 경로
                .addResourceLocations("/resources/");    // webapp/resources/경로로 매핑
    }

    // jsp view resolver 설정
    //컨트롤러에서 받은 결과를 어떤 jsp파일을 불러서 넣어줄 지 위치를 설정하고
    //뒤에 jsp를 붙여서 만들어주는 기능의 함수
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //뷰 리졸버 객체를 생성하고
        //앞 -> 위치 지정
        //뒤 -> jsp지정
        //이 객체를 등록하자
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean);
    }
}