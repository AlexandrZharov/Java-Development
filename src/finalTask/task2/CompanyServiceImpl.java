package finalTask.task2;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyServiceImpl implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        return child.getParent();
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long companyEmployeeCount = company.getEmployeesCount();
        List<Company> childCompanies = companies.stream()
                .filter(comp -> company.equals(comp.getParent()))
                .collect(Collectors.toList());
        long childrenEmployeeCount = 0;
        for (Company child: childCompanies) {
            childrenEmployeeCount += getEmployeeCountForCompanyAndChildren(child, companies);
        }
        long totalEmployeeCount = companyEmployeeCount + childrenEmployeeCount;
        return totalEmployeeCount;
    }
}
