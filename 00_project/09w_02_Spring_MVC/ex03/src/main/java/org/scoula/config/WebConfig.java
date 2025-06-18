package org.scoula.config;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

// Spring Web 애플리케이션의 초기 설정을 담당
// 서블릿 설정을 위한 초기화 클래스
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 루트 애플리케이션 컨텍스트 설정 클래스 (RootConfig) 지정 - DB 설정
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }
    
    // DispatcherServlet 전용 설정 클래스 (ServletConfig) 지정 - MVC 설정
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { ServletConfig.class };
    }

    // 모든 요청을 DispatcherServlet이 처리하도록 매핑
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    // 서블릿에 필터를 등록하기 위한 메서드
    @Override
    protected Filter[] getServletFilters() {
        // 요청과 응답의 인코딩을 UTF-8로 설정하기 위한 필터 객체 생성
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        // 생성한 인코딩 필터를 등록
        return new Filter[] {characterEncodingFilter};
    }
}