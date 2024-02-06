package creditCard.CreditCardManagement.service;

import creditCard.CreditCardManagement.model.CreditCardDetails;
import creditCard.CreditCardManagement.repository.CreditCardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreditCardDetailsService {

    @Autowired
    private CreditCardDetailsRepository repo;



    public CreditCardDetails saveCreditCard(CreditCardDetails creditCard) {

        String creditCardStatemmentCloseDate = creditCard.getStatementCloseDate();
        int creditCardDate = Integer.parseInt(creditCardStatemmentCloseDate.substring(5,7));
        int creditCardMonth = Integer.parseInt(creditCardStatemmentCloseDate.substring(8,10));

          CreditCardDetails existingCreditCard = repo.findByBankName(creditCard.getBankName());
          if(existingCreditCard !=null || creditCardDate > 31 || creditCardDate < 1 || creditCardMonth > 12 || creditCardMonth < 1) {
              throw new RuntimeException();
          }
        return   repo.save(creditCard);
    }

    public List<CreditCardDetails> getAllCreditCards(){
        return repo.findAll();
    }

    public CreditCardDetails getCreditCardById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteCreditcard(Long id) {
        repo.deleteById(id);
    }
}
