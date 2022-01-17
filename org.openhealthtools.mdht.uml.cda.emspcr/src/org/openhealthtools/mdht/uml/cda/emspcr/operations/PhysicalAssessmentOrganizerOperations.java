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
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Assessment Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component9</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component10</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component11</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component12</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent13(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component13</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent14(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component14</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent15(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component15</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component42</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalAssessmentOrganizerOperations extends OrganizerOperations {
 
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected PhysicalAssessmentOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent4(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent4(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent4(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component4</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent4(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent4(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent4","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent4"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent3(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent3(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent3(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent3(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent3(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent3","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent3"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent5(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent5(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent5(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component5</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent5(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent5(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent5","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent5"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent6(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent6(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent6(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component6</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent6(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent6(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent6","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent6"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent8(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent8(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent8(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component8</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent8(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent8(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent8","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent8"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent9(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent9(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent9(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component9</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent9(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent9(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent9","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent9"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent10(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent10(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent10(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component10</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent10(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent10(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent10","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent10"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent11(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent11(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent11(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component11</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent11(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent11(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent11","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent11"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent12(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent12(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent12(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component12</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent12(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent12(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent12","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent12"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent13(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent13(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent13(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component13</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent13(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent13(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent13","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent13"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent14(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent14(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent14(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component14</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent14(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent14(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent14","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent14"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerTemplateId(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerTemplateId(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.78' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerTemplateId(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerTemplateId(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerTemplateId(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerTemplateId"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent15(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent15(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent15(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component15</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent15(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent15(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent15","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT15,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent15"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalAssessmentOrganizerComponent42(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent42(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalAssessmentOrganizerComponent42(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component42</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalAssessmentOrganizerComponent42(PhysicalAssessmentOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalAssessmentOrganizer The receiving '<em><b>Physical Assessment Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalAssessmentOrganizerComponent42(PhysicalAssessmentOrganizer physicalAssessmentOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent42","INFO");
    
  	  
  	  
		if (VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_ORGANIZER);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalAssessmentOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PHYSICAL_ASSESSMENT_ORGANIZER__PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT42,
						 EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentOrganizerPhysicalAssessmentOrganizerComponent42"),
						 new Object [] { physicalAssessmentOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // PhysicalAssessmentOrganizerOperations