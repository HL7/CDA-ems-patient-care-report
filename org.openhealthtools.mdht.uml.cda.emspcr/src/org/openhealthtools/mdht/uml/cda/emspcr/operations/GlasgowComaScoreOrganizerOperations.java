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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Coma Score Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerComponent4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlasgowComaScoreOrganizerOperations extends OrganizerOperations {
 
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
	protected GlasgowComaScoreOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerComponent4(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerComponent4(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerComponent4(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component4</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerComponent4(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerComponent4(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"GlasgowComaScoreOrganizerGlasgowComaScoreOrganizerComponent4","ERROR");
    
  	  
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT4,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowComaScoreOrganizerComponent4"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.170' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerTemplateId(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"GlasgowComaScoreOrganizerGlasgowComaScoreOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowComaScoreOrganizerTemplateId"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param glasgowComaScoreOrganizer The receiving '<em><b>Glasgow Coma Score Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateGlasgowComaScoreOrganizerEffectiveTime(GlasgowComaScoreOrganizer glasgowComaScoreOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"GlasgowComaScoreOrganizerGlasgowComaScoreOrganizerEffectiveTime","INFO");
    
  	  
  	  
		if (VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER);
			try {
				VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(glasgowComaScoreOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.GLASGOW_COMA_SCORE_ORGANIZER__GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("GlasgowComaScoreOrganizerGlasgowComaScoreOrganizerEffectiveTime"),
						 new Object [] { glasgowComaScoreOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // GlasgowComaScoreOrganizerOperations