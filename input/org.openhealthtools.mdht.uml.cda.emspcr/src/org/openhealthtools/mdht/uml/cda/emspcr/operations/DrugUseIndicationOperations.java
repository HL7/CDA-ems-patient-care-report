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

import org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Use Indication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication#validateDrugUseIndicationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugUseIndicationOperations extends ClinicalStatementOperations {

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
	protected DrugUseIndicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugUseIndicationTemplateId(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationTemplateId(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.71' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugUseIndicationTemplateId(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationTemplateId(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugUseIndication The receiving '<em><b>Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDrugUseIndicationTemplateId(DrugUseIndication drugUseIndication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugUseIndicationDrugUseIndicationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_USE_INDICATION);
			try {
				VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_USE_INDICATION__DRUG_USE_INDICATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DrugUseIndicationDrugUseIndicationTemplateId"),
						 new Object [] { drugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugUseIndicationMoodCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationMoodCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugUseIndicationMoodCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationMoodCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugUseIndication The receiving '<em><b>Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDrugUseIndicationMoodCode(DrugUseIndication drugUseIndication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugUseIndicationDrugUseIndicationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_USE_INDICATION);
			try {
				VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_USE_INDICATION__DRUG_USE_INDICATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DrugUseIndicationDrugUseIndicationMoodCode"),
						 new Object [] { drugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugUseIndicationCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67669-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugUseIndicationCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationCode(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugUseIndication The receiving '<em><b>Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDrugUseIndicationCode(DrugUseIndication drugUseIndication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugUseIndicationDrugUseIndicationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_USE_INDICATION);
			try {
				VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_USE_INDICATION__DRUG_USE_INDICATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("DrugUseIndicationDrugUseIndicationCode"),
						 new Object [] { drugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugUseIndicationValue(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationValue(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17323-9' or value.code = 'LA17324-7' or value.code = 'LA17325-4' or value.code = 'LA17326-2' or value.code = 'LA17327-0' or value.code = 'LA32962-5')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugUseIndicationValue(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationValue(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugUseIndication The receiving '<em><b>Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDrugUseIndicationValue(DrugUseIndication drugUseIndication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugUseIndicationDrugUseIndicationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_USE_INDICATION);
			try {
				VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_USE_INDICATION__DRUG_USE_INDICATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("DrugUseIndicationDrugUseIndicationValue"),
						 new Object [] { drugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugUseIndicationValueP(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationValueP(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_USE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugUseIndicationValueP(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Use Indication Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugUseIndicationValueP(DrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_USE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugUseIndication The receiving '<em><b>Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDrugUseIndicationValueP(DrugUseIndication drugUseIndication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugUseIndicationDrugUseIndicationValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_USE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_USE_INDICATION);
			try {
				VALIDATE_DRUG_USE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_USE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_USE_INDICATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_USE_INDICATION__DRUG_USE_INDICATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("DrugUseIndicationDrugUseIndicationValueP"),
						 new Object [] { drugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

} // DrugUseIndicationOperations
