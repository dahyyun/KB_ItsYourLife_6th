package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 설정 클래스임을 명시
@Configuration

// 컴포넌트 스캔을 통해 자동으로 빈을 등록
@ComponentScan("org.scoula.beans")
public class ProjectConfig2 {
}
