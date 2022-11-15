package dev.be.moduleapi;
// component scan의 해당 package의 하위만 스캔해서 bean으로 등록
// scan범위를 common 모듈과 맞춰주기 위해 package path를 변경
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// package path 변경 대신 scan할 base package 명시
@SpringBootApplication(
	scanBasePackages = {"dev.be.moduleapi","dev.be.modulecommon"}
)
@EntityScan("dev.be.modulecommon.domain")
@EnableJpaRepositories("dev.be.modulecommon.repositories")
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
