package finalTask.task2;

import java.util.Arrays;
import java.util.List;

/**
 * FinalTask Main class
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 *
 * Topic: COMPANY Service implementation
 *
 */
public class Main {

    public static void main(String[] args) {
        Company accounting = new Company(null, 8);
        Company chief = new Company(null, 1);
        Company lawyer = new Company(chief, 5);
        Company developer = new Company(chief, 30);
        Company backEnd = new Company(developer, 10);
        Company frontEnd = new Company(developer, 7);
        Company devOps = new Company(backEnd, 2);
        Company design = new Company(frontEnd, 3);

        List<Company> companies = Arrays.asList(accounting, chief, lawyer, developer, backEnd, frontEnd, devOps, design);

        ICompanyService companyService = new CompanyServiceImpl();

        long developerEmployeeCount = companyService.getEmployeeCountForCompanyAndChildren(developer, companies);

        System.out.println("Developer's employee count is " + developerEmployeeCount);
    }
}
