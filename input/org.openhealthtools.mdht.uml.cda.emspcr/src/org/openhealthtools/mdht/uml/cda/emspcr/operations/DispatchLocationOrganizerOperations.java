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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Location Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerDispatchLocationNameRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Name Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Latitude Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Longtude Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer#validateDispatchLocationOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispatchLocationOrganizerOperations extends OrganizerOperations {

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
	protected DispatchLocationOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationOrganizerDispatchLocationNameRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Name Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerDispatchLocationNameRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationOrganizerDispatchLocationNameRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Name Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerDispatchLocationNameRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationOrganizer The receiving '<em><b>Dispatch Location Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationOrganizerDispatchLocationNameRelationship(
			DispatchLocationOrganizer dispatchLocationOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchLocationOrganizerDispatchLocationOrganizerDispatchLocationNameRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_ORGANIZER);
			try {
				VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchLocationOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_LOCATION_ORGANIZER__DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_NAME_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DispatchLocationOrganizerDispatchLocationOrganizerDispatchLocationNameRelationship"),
						 new Object [] { dispatchLocationOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Latitude Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Latitude Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationOrganizer The receiving '<em><b>Dispatch Location Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationOrganizerDispatchLocationLatitudeRelationship(
			DispatchLocationOrganizer dispatchLocationOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchLocationOrganizerDispatchLocationOrganizerDispatchLocationLatitudeRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_ORGANIZER);
			try {
				VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchLocationOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_LOCATION_ORGANIZER__DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LATITUDE_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DispatchLocationOrganizerDispatchLocationOrganizerDispatchLocationLatitudeRelationship"),
						 new Object [] { dispatchLocationOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Longtude Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Dispatch Location Longtude Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationOrganizer The receiving '<em><b>Dispatch Location Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationOrganizerDispatchLocationLongtudeRelationship(
			DispatchLocationOrganizer dispatchLocationOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchLocationOrganizerDispatchLocationOrganizerDispatchLocationLongtudeRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_ORGANIZER);
			try {
				VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchLocationOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_LOCATION_ORGANIZER__DISPATCH_LOCATION_ORGANIZER_DISPATCH_LOCATION_LONGTUDE_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DispatchLocationOrganizerDispatchLocationOrganizerDispatchLocationLongtudeRelationship"),
						 new Object [] { dispatchLocationOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationOrganizerTemplateId(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerTemplateId(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.96' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationOrganizerTemplateId(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationOrganizerTemplateId(DispatchLocationOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationOrganizer The receiving '<em><b>Dispatch Location Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationOrganizerTemplateId(
			DispatchLocationOrganizer dispatchLocationOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchLocationOrganizerDispatchLocationOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_ORGANIZER);
			try {
				VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchLocationOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_LOCATION_ORGANIZER__DISPATCH_LOCATION_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DispatchLocationOrganizerDispatchLocationOrganizerTemplateId"),
						 new Object [] { dispatchLocationOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // DispatchLocationOrganizerOperations
