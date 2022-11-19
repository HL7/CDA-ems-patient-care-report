/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Odometer Reading Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Beginning Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response On Scene Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Destination Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Ending Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseOdometerReadingOrganizerOperations extends OrganizerOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseOdometerReadingOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Beginning Odometer Reading Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Beginning Odometer Reading Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOdometerReadingOrganizer The receiving '<em><b>Response Odometer Reading Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(
			ResponseOdometerReadingOrganizer responseOdometerReadingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ODOMETER_READING_ORGANIZER);
			try {
				VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseOdometerReadingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ODOMETER_READING_ORGANIZER__RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship"),
						 new Object [] { responseOdometerReadingOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response On Scene Odometer Reading Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response On Scene Odometer Reading Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOdometerReadingOrganizer The receiving '<em><b>Response Odometer Reading Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(
			ResponseOdometerReadingOrganizer responseOdometerReadingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ODOMETER_READING_ORGANIZER);
			try {
				VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseOdometerReadingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ODOMETER_READING_ORGANIZER__RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship"),
						 new Object [] { responseOdometerReadingOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Destination Odometer Reading Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Destination Odometer Reading Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOdometerReadingOrganizer The receiving '<em><b>Response Odometer Reading Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(
			ResponseOdometerReadingOrganizer responseOdometerReadingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ODOMETER_READING_ORGANIZER);
			try {
				VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseOdometerReadingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ODOMETER_READING_ORGANIZER__RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship"),
						 new Object [] { responseOdometerReadingOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Ending Odometer Reading Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Ending Odometer Reading Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOdometerReadingOrganizer The receiving '<em><b>Response Odometer Reading Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(
			ResponseOdometerReadingOrganizer responseOdometerReadingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ODOMETER_READING_ORGANIZER);
			try {
				VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseOdometerReadingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ODOMETER_READING_ORGANIZER__RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship"),
						 new Object [] { responseOdometerReadingOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseOdometerReadingOrganizerTemplateId(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerTemplateId(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.97' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseOdometerReadingOrganizerTemplateId(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseOdometerReadingOrganizerTemplateId(ResponseOdometerReadingOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseOdometerReadingOrganizer The receiving '<em><b>Response Odometer Reading Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseOdometerReadingOrganizerTemplateId(
			ResponseOdometerReadingOrganizer responseOdometerReadingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_ODOMETER_READING_ORGANIZER);
			try {
				VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseOdometerReadingOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_ODOMETER_READING_ORGANIZER__RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ResponseOdometerReadingOrganizerResponseOdometerReadingOrganizerTemplateId"),
						 new Object [] { responseOdometerReadingOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // ResponseOdometerReadingOrganizerOperations
