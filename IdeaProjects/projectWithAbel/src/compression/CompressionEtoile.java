package compression;

import java.util.ArrayList;

public class CompressionEtoile {

   public static void main(String[] args) {
      String textAComprimer = "Application for Teachers like google forms  Introduction This application enables teachers to enter, format, and manage their tests from their phones. It offers intuitive, user-friendly features for creating and organizing tests with various elements.  Main Features 1. Create and Name a Test   - Home Page:     - Test Title: Input field for naming the test.     - Save Button: Allows saving the test at any time. 2. Add and Organize Questions   - Questions Area:     - Add a Question Button: Adds a new question section.     - **List of Questions:** Displays added questions in separate sections. 3. **Text Formatting Options**   - **Formatting Toolbar:**     - **Bold (B):** Make text bold.     - **Italic (I):** Italicize text.     - **Underline (U):** Underline text.     - **Add Link:** Insert a hyperlink.     - **Add Image:** Insert an image.     - **Add Separation Line:** Add a line between text sections. 4. **Diverse Question Types**   - **Question Type Dropdown:**     - Multiple Choice     - Checkboxes     - Dropdown     - Short Answer     - Paragraph     - File Upload     - Checkbox Grid 5. **Adding Media and Files**   - **Added Media:**     - **Image:** Insert images in questions or answers.     - **Document:** Attach documents for reference. 6. **Backup and Sharing**   - **Save Button:**     - **Automatic Save:** Saves test at intervals.     - **Manual Save:** Allows manual saving anytime.   - **Sharing:**     - **Email:** Send tests by email.     - **PDF Export:** Generate a PDF for printing or distribution.     - **Education Platforms:** Share on online education platforms. ### Details of Screens and Navigation 1. **Homepage**   - Title: “My Tests”   - List of Tests: View, create, edit, or delete tests.   - **Create New Test Button:** Start a new test. 2. **Event Creation Screen**   - **Title Input Field:** Name the test.   - **Add a Question Button:** Add new questions.   - **Question List:** Edit, duplicate, or delete questions. 3. **Question Section**   - **Question Type Dropdown:** Select type of question.   - **Question Text Field:** Enter the question.   - **Answer Options:** Input answer options if needed.   - Formatting Toolbar:** Format text.   - **Add Image Button:** Add images.   - **Add File Button:** Attach files. 4. **Viewing and Sharing Screen   - Test Preview: View test as students will see it.   - **Export to PDF Button: Generate PDF of the test.   - **Share Button: Options to share test by email or platforms.";

      String nouveauTexte = textAComprimer.replace("*", "");

      nouveauTexte = nouveauTexte.replace("-", "");

      nouveauTexte = nouveauTexte.replace("  ", "");

      nouveauTexte = nouveauTexte.replace(".", "");

      System.out.println(nouveauTexte);

   }

}
