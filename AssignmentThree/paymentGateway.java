/**
 * External payment gateway service
 */
public class PaymentGateway {
    
    /**
     * Message 13: Validates and processes payment
     */
    public boolean validateAndProcess(PaymentDetails details) {
        System.out.println("\nProcessing payment through gateway...");
        
        // Self-call: Verify card and check funds
        boolean cardValid = verifyCard(details);
        boolean fundsAvailable = checkFunds(details);
        
        // Message 14: Return confirmation or error (alt fragment)
        if (cardValid && fundsAvailable) {
            System.out.println("Payment processed successfully");
            return true; // confirmed
        } else {
            System.out.println("Payment processing failed");
            return false; // error
        }
    }
    
    /**
     * Self-call: Verifies card details
     */
    private boolean verifyCard(PaymentDetails details) {
        System.out.println("  -> Verifying card details...");
        // Simulate card verification
        return details.getCardNumber() != null && 
               details.getCardNumber().length() == 16;
    }
    
    /**
     * Self-call: Checks if sufficient funds are available
     */
    private boolean checkFunds(PaymentDetails details) {
        System.out.println("  -> Checking available funds...");
        // Simulate funds check
        return true; // Assume funds available for demo
    }
}