package ra.springcontroller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ra.springcontroller") // @Component , @Controller, @Service, @Repository
public class AppConfig implements WebMvcConfigurer {
    private static final String uploadPath ="C:\\Users\\AD\\Desktop\\spring-controller\\src\\main\\webapp\\uploads\\";
    @Bean
    public ViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return  resolver;
    }
    // cấu hình kích thươc file upload
    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSizePerFile(25*1024*1024); // 25MB
        return resolver;
    }

    // cấu hình đường dẫn

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:"+uploadPath);
    }
}
