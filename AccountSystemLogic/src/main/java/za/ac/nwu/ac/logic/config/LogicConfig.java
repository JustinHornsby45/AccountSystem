package za.ac.nwu.ac.logic.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.translator.config.TranslatorConfig;
import za.ac.nwu.ac.translator.AccountTransactionDetailsTranslator;

@Import(TranslatorConfig.class)
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.logic.flow."
})
public class LogicConfig {
}
