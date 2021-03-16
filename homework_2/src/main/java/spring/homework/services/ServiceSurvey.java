package spring.homework.services;

import spring.homework.domain.Survey;
import spring.homework.exceptions.ServiceIOException;
import spring.homework.exceptions.SurveyException;

import java.io.IOException;
import java.util.List;

public interface ServiceSurvey {
    void test() throws SurveyException;
}
