/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Cause</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardiacArrestCauseOperations extends ClinicalStatementOperations {

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
	protected CardiacArrestCauseOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCauseTemplateId(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseTemplateId(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.124' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCauseTemplateId(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseTemplateId(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestCause The receiving '<em><b>Cardiac Arrest Cause</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCauseTemplateId(CardiacArrestCause cardiacArrestCause,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestCauseCardiacArrestCauseTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_CAUSE);
			try {
				VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestCause)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_CAUSE__CARDIAC_ARREST_CAUSE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestCauseCardiacArrestCauseTemplateId"),
						 new Object [] { cardiacArrestCause }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCauseMoodCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseMoodCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCauseMoodCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseMoodCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestCause The receiving '<em><b>Cardiac Arrest Cause</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCauseMoodCode(CardiacArrestCause cardiacArrestCause,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestCauseCardiacArrestCauseMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_CAUSE);
			try {
				VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestCause)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_CAUSE__CARDIAC_ARREST_CAUSE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestCauseCardiacArrestCauseMoodCode"),
						 new Object [] { cardiacArrestCause }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCauseCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67503-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCauseCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseCode(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestCause The receiving '<em><b>Cardiac Arrest Cause</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCauseCode(CardiacArrestCause cardiacArrestCause,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestCauseCardiacArrestCauseCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_CAUSE);
			try {
				VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestCause)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_CAUSE__CARDIAC_ARREST_CAUSE_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestCauseCardiacArrestCauseCode"),
						 new Object [] { cardiacArrestCause }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCauseValue(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseValue(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17056-5' or value.code = 'LA17058-1' or value.code = 'LA17059-9' or value.code = 'LA17977-2' or value.code = 'LA17978-0' or value.code = 'LA17979-8' or value.code = 'LA17980-6' or value.code = 'LA9539-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCauseValue(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseValue(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestCause The receiving '<em><b>Cardiac Arrest Cause</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCauseValue(CardiacArrestCause cardiacArrestCause,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestCauseCardiacArrestCauseValue","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_CAUSE);
			try {
				VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestCause)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_CAUSE__CARDIAC_ARREST_CAUSE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestCauseCardiacArrestCauseValue"),
						 new Object [] { cardiacArrestCause }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacArrestCauseValueP(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseValueP(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_ARREST_CAUSE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacArrestCauseValueP(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacArrestCauseValueP(CardiacArrestCause, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_ARREST_CAUSE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacArrestCause The receiving '<em><b>Cardiac Arrest Cause</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacArrestCauseValueP(CardiacArrestCause cardiacArrestCause,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CardiacArrestCauseCardiacArrestCauseValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_CARDIAC_ARREST_CAUSE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_ARREST_CAUSE);
			try {
				VALIDATE_CARDIAC_ARREST_CAUSE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_ARREST_CAUSE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_ARREST_CAUSE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacArrestCause)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_ARREST_CAUSE__CARDIAC_ARREST_CAUSE_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("CardiacArrestCauseCardiacArrestCauseValueP"),
						 new Object [] { cardiacArrestCause }));
			}
			 
			return false;
		}
		return true;
	}

} // CardiacArrestCauseOperations
