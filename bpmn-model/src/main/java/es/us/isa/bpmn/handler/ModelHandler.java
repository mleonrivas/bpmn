package es.us.isa.bpmn.handler;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;

/**
 * Interface of classes that import from and export to XML
 *
 * @author resinas
 * @author Edelia
 *
 */
public interface ModelHandler {

	/**
	 * Devuelve el id del proceso involucrado en el xml
	 * 
	 * @return Id del proceso
	 */
    @Deprecated
	public String getProcId();

    /**
     * Returns the id of the processes involved in the xml
     *
     * @return Processes id
     */
    public Collection<String> getProcessId();
	
	/**
	 * Generate model instances from an XML file
	 *
	 * @param path File path
	 * @param file File name
	 * @throws Exception
	 */
	public void load(String path, String file) throws Exception;
	
    /**
	 * Generate model instances from an XML stream
     * 
     * @param stream 
     * @throws Exception
     */
	public void load(InputStream stream) throws Exception;
	
	/**
	 * Saves model instances into an XML file
	 * 
	 * @param path Camino
	 * @param file Nombre del fichero
	 * @param procId Id del proceso
	 * @throws Exception
	 */
	public void save(String path, String file, String procId) throws Exception;
	
	/**
	 * Saves model instances from an XML file
	 * 
	 * @param stream
	 * @param procId Id del proceso
	 * @throws Exception
	 */
	public void save(OutputStream stream, String procId) throws Exception;

    /**
     * Returns the element of the model with the given id
     * @param id
     * @return
     */
    Object getElement(String id);
}
