import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class OwlParser {
    public static void main(String[] args) {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        try {
            OWLOntology ontology = manager.loadOntology(IRI.create("https://raw.githubusercontent.com/mubashar-iqbal/HealthOnt/main/HealthOnt.owl"));
            ontology.saveOntology(new FunctionalSyntaxDocumentFormat(), System.out);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
