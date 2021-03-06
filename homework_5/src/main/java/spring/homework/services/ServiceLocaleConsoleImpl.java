package spring.homework.services;

import org.springframework.stereotype.Service;
import spring.homework.exceptions.TestException;

@Service
public class ServiceLocaleConsoleImpl implements ServiceLocaleConsole{

    private final ServiceIO serviceConsole;
    private final ServiceLocale serviceLocale;

    public ServiceLocaleConsoleImpl(ServiceIO serviceConsole, ServiceLocale serviceLocale) {
        this.serviceConsole = serviceConsole;
        this.serviceLocale = serviceLocale;
    }

    @Override
    public void output(String out, Object... args) {
        String localeOut=serviceLocale.localize(out,args);
        serviceConsole.output(localeOut);
    }

    @Override
    public String input() throws TestException {
        return serviceConsole.input();
    }
}
