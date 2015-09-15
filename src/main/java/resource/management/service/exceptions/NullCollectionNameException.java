package resource.management.service.exceptions;

/**
 * Exception thrown if the {@link com.eeb.dropwizardmongo.factory.MongoFactory} attempts to build
 * a DBCollection object and the configured collection name is null.
 */
public class NullCollectionNameException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1423110432254933204L;
    private static final String message = "Attempt made to create a DBCollection object when t" +
            "he configured collection name was null or invalid";

    public NullCollectionNameException() {
        super(message);
    }
}
