package creditCard.CreditCardManagement.controller;



import creditCard.CreditCardManagement.model.CreditCardDetails;
import creditCard.CreditCardManagement.service.CreditCardDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CreditCardDetails")
public class CreditCardDetailsController {

       @Autowired
       private CreditCardDetailsService creditCardDetailsService;

        @PostMapping
        public CreditCardDetails saveCreditCard(@RequestBody CreditCardDetails creditCardDetails) {
        return creditCardDetailsService.saveCreditCard(creditCardDetails);
        }

        @GetMapping
        public List<CreditCardDetails> getAllCreditCards() {
        return creditCardDetailsService.getAllCreditCards();
        }

        @GetMapping("/{id}")
        public CreditCardDetails getCreditCardById(@PathVariable Long id) {
        return creditCardDetailsService.getCreditCardById(id);
        }

        @DeleteMapping("/{id}")
        public void deleteCreditCard(@PathVariable Long id) {
        creditCardDetailsService.deleteCreditcard(id);
        }

    }
