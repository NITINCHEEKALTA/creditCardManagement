package creditCard.CreditCardManagement.repository;

import creditCard.CreditCardManagement.model.CreditCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;


import java.util.Optional;

public interface CreditCardDetailsRepository extends JpaRepository<CreditCardDetails, Long>, QueryByExampleExecutor<CreditCardDetails> {

CreditCardDetails findByBankName(String name);
}
