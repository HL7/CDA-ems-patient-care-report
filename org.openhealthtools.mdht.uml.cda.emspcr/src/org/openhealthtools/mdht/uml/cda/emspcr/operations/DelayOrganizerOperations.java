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

import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Delay Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerDispatchDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Dispatch Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerResponseDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Response Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerSceneDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Scene Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerTransportDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Transport Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerTurnaoundDelayRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Turnaound Delay Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer#validateDelayOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelayOrganizerOperations extends OrganizerOperations {

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
	protected DelayOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelayOrganizerDispatchDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Dispatch Delay Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerDispatchDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDelayOrganizerDispatchDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Dispatch Delay Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerDispatchDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param delayOrganizer The receiving '<em><b>Delay Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDelayOrganizerDispatchDelayRelationship(DelayOrganizer delayOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DelayOrganizerDelayOrganizerDispatchDelayRelationship","ERROR");
    
  	  
  	  
		if (VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DELAY_ORGANIZER);
			try {
				VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(delayOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DELAY_ORGANIZER__DELAY_ORGANIZER_DISPATCH_DELAY_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DelayOrganizerDelayOrganizerDispatchDelayRelationship"),
						 new Object [] { delayOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelayOrganizerResponseDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Response Delay Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerResponseDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDelayOrganizerResponseDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Response Delay Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerResponseDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param delayOrganizer The receiving '<em><b>Delay Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDelayOrganizerResponseDelayRelationship(DelayOrganizer delayOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DelayOrganizerDelayOrganizerResponseDelayRelationship","ERROR");
    
  	  
  	  
		if (VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DELAY_ORGANIZER);
			try {
				VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(delayOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DELAY_ORGANIZER__DELAY_ORGANIZER_RESPONSE_DELAY_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DelayOrganizerDelayOrganizerResponseDelayRelationship"),
						 new Object [] { delayOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelayOrganizerSceneDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Scene Delay Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerSceneDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDelayOrganizerSceneDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Scene Delay Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerSceneDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param delayOrganizer The receiving '<em><b>Delay Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDelayOrganizerSceneDelayRelationship(DelayOrganizer delayOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DelayOrganizerDelayOrganizerSceneDelayRelationship","ERROR");
    
  	  
  	  
		if (VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DELAY_ORGANIZER);
			try {
				VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(delayOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DELAY_ORGANIZER__DELAY_ORGANIZER_SCENE_DELAY_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DelayOrganizerDelayOrganizerSceneDelayRelationship"),
						 new Object [] { delayOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelayOrganizerTransportDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Transport Delay Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerTransportDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDelayOrganizerTransportDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Transport Delay Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerTransportDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param delayOrganizer The receiving '<em><b>Delay Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDelayOrganizerTransportDelayRelationship(DelayOrganizer delayOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DelayOrganizerDelayOrganizerTransportDelayRelationship","ERROR");
    
  	  
  	  
		if (VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DELAY_ORGANIZER);
			try {
				VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(delayOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DELAY_ORGANIZER__DELAY_ORGANIZER_TRANSPORT_DELAY_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DelayOrganizerDelayOrganizerTransportDelayRelationship"),
						 new Object [] { delayOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelayOrganizerTurnaoundDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Turnaound Delay Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerTurnaoundDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDelayOrganizerTurnaoundDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Turnaound Delay Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerTurnaoundDelayRelationship(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param delayOrganizer The receiving '<em><b>Delay Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDelayOrganizerTurnaoundDelayRelationship(DelayOrganizer delayOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DelayOrganizerDelayOrganizerTurnaoundDelayRelationship","ERROR");
    
  	  
  	  
		if (VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DELAY_ORGANIZER);
			try {
				VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(delayOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DELAY_ORGANIZER__DELAY_ORGANIZER_TURNAOUND_DELAY_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("DelayOrganizerDelayOrganizerTurnaoundDelayRelationship"),
						 new Object [] { delayOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelayOrganizerTemplateId(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerTemplateId(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.95' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDelayOrganizerTemplateId(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delay Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelayOrganizerTemplateId(DelayOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param delayOrganizer The receiving '<em><b>Delay Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDelayOrganizerTemplateId(DelayOrganizer delayOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DelayOrganizerDelayOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DELAY_ORGANIZER);
			try {
				VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DELAY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(delayOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DELAY_ORGANIZER__DELAY_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DelayOrganizerDelayOrganizerTemplateId"),
						 new Object [] { delayOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // DelayOrganizerOperations
