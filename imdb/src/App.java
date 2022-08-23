import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import movies.Element;
import movies.MoviesFactory;
import movies.MoviesPackage;
import movies.RootElement;

public class App {

	public static void main(String[] args) throws IOException {
		EPackage.Registry.INSTANCE.put(MoviesPackage.eINSTANCE.getNsURI(), MoviesPackage.eINSTANCE);
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource input = rSet.getResource(URI.createURI("model/movies-test.xmi"), true);
		System.out.println(input.getContents().get(0));
		
		Resource output = rSet.createResource(URI.createURI("model/output-movies-test.xmi"));
		RootElement r = MoviesFactory.eINSTANCE.createRootElement();
		output.getContents().add(r);
//		Iterable<EObject> inEObjects = () -> input.getAllContents();
		List<Element> el = input.getContents().stream().map(e -> (Element)e)
			.toList();
		r.getContent().addAll(el);
		output.save(Collections.EMPTY_MAP);
	}
	
}
