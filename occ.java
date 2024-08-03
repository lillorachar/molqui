import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreateContentItemParameters createParams = new CreateContentItemParameters(
            "New Content Item",
            "This is a description of the new content item.",
            Arrays.asList("java", "programming", "example"),
            "Jane Doe"
        );

        // Use createParams as needed
        System.out.println("Title: " + createParams.getTitle());
        System.out.println("Description: " + createParams.getDescription());
        System.out.println("Tags: " + String.join(", ", createParams.getTags()));
        System.out.println("Created By: " + createParams.getCreatedBy());
        System.out.println("Created At: " + createParams.getCreatedAt());
    }
}
