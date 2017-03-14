package ru.easyjava.spring.data.jpa.dal.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import ru.easyjava.spring.data.jpa.entity.Company;
import ru.easyjava.spring.data.jpa.entity.Person;

public class PersonSpecification {
    public static Specification<Person> personWorksIn(final String companyName) {
        return new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root,
                    CriteriaQuery<?> criteriaQuery,
                    CriteriaBuilder criteriaBuilder) {
                Join<Person, Company> company = root.join("workingPlaces");
                return criteriaBuilder.equal(company.get("name"), companyName);
            }
        };
    }

}
