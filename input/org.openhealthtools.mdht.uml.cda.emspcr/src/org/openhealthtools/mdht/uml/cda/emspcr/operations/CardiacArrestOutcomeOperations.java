/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Outcome</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcome#validateCardiacArrestOutcomeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardiacArrestOutcomeOperations extends ClinicalStatementOperations {

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
	protected CardiacArrestOutcomeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestOutcomeTemplateId(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeTemplateId(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.184' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestOutcomeTemplateId(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeTemplateId(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestOutcome The receiving '<em><b>Cardiac Arrest Outcome</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestOutcomeTemplateId(CardiacArrestOutcome cardiacArrestOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestOutcomeCardiacArrestOutcomeTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME);
			try {
				VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestOutcome)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_OUTCOME__CARDIAC_ARREST_OUTCOME_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestOutcomeCardiacArrestOutcomeTemplateId"),
						 new Object [] { cardiacArrestOutcome }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestOutcomeCodeP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeCodeP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestOutcomeCodeP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeCodeP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestOutcome The receiving '<em><b>Cardiac Arrest Outcome</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestOutcomeCodeP(CardiacArrestOutcome cardiacArrestOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestOutcomeCardiacArrestOutcomeCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME);
			try {
				VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestOutcome)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_OUTCOME__CARDIAC_ARREST_OUTCOME_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestOutcomeCardiacArrestOutcomeCodeP"),
						 new Object [] { cardiacArrestOutcome }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcomeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcomeCodeP", passToken);
				}
				passToken.add(cardiacArrestOutcome);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestOutcomeCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77152-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestOutcomeCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestOutcome The receiving '<em><b>Cardiac Arrest Outcome</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestOutcomeCode(CardiacArrestOutcome cardiacArrestOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestOutcomeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(cardiacArrestOutcome)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestOutcomeCardiacArrestOutcomeCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME);
			try {
				VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestOutcome)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_OUTCOME__CARDIAC_ARREST_OUTCOME_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestOutcomeCardiacArrestOutcomeCode"),
						 new Object [] { cardiacArrestOutcome }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestOutcomeMoodCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeMoodCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestOutcomeMoodCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeMoodCode(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestOutcome The receiving '<em><b>Cardiac Arrest Outcome</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestOutcomeMoodCode(CardiacArrestOutcome cardiacArrestOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestOutcomeCardiacArrestOutcomeMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME);
			try {
				VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestOutcome)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_OUTCOME__CARDIAC_ARREST_OUTCOME_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestOutcomeCardiacArrestOutcomeMoodCode"),
						 new Object [] { cardiacArrestOutcome }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestOutcomeValue(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeValue(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA22792-8' or value.code = 'LA22793-6' or value.code = 'LA22794-4' or value.code = 'LA22795-1' or value.code = 'LA22796-9' or value.code = 'LA22797-7')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestOutcomeValue(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeValue(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestOutcome The receiving '<em><b>Cardiac Arrest Outcome</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestOutcomeValue(CardiacArrestOutcome cardiacArrestOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestOutcomeCardiacArrestOutcomeValue","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME);
			try {
				VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestOutcome)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_OUTCOME__CARDIAC_ARREST_OUTCOME_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestOutcomeCardiacArrestOutcomeValue"),
						 new Object [] { cardiacArrestOutcome }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestOutcomeValueP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeValueP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestOutcomeValueP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Outcome Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestOutcomeValueP(CardiacArrestOutcome, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestOutcome The receiving '<em><b>Cardiac Arrest Outcome</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestOutcomeValueP(CardiacArrestOutcome cardiacArrestOutcome,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestOutcomeCardiacArrestOutcomeValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_OUTCOME);
			try {
				VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_OUTCOME_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestOutcome)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_OUTCOME__CARDIAC_ARREST_OUTCOME_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestOutcomeCardiacArrestOutcomeValueP"),
						 new Object [] { cardiacArrestOutcome }));
			}
			 
			return false;
		}
		return true;
	}

} // CardiacArrestOutcomeOperations
