package dev.be;
// component scan의 해당 package의 하위만 스캔해서 bean으로 등록
// scan범위를 common 모듈과 맞춰주기 위해 package path를 변경
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
