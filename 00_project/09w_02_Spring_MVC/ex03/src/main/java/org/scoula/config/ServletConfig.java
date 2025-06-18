package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// Spring MVC 활성화
@EnableWebMvc
// 컴포넌트 스캔 경로 추가 (@Component 붙은 클래스 자동으로 스캔)
@ComponentScan(basePackages = {"org.scoula"})
// Spring MVC 설정을 커스터마이징
public class ServletConfig implements WebMvcConfigurer {

    // 정적 리소스의 경로를 매핑하기 위한 메서드 오버라이드
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                // 클라이언트가 /resources/** 경로로 접근할 때
                .addResourceHandler("/resources/**")
                // 실제 /resource/ 폴더에서 파일을 제공
                .addResourceLocations("/resources/");    
    }

    // 뷰 리졸버 설정을 위한 메서드를 오버라이드
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // JSP 뷰를 처리할 객체를 생성
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        // 뷰로 JSTL이 포함된 JSP를 사용할 수 있도록 설정
        bean.setViewClass(JstlView.class);
        // JSP 파일들이 /WEB-INF/views/ 디렉토리에 있다는 것을 지정
        bean.setPrefix("/WEB-INF/views/");
        // 뷰 이름 뒤에 .jsp 를 붙여 JSP 파일을 찾도록 설정
        bean.setSuffix(".jsp");
        // 위에서 설정한 뷰 리졸버를 Spring MVC에 등록
        registry.viewResolver(bean);
    }
}