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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Location In Vehicle</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle#validatePatientLocationInVehicleValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientLocationInVehicleOperations extends ClinicalStatementOperations {

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
	protected PatientLocationInVehicleOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.55' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientLocationInVehicleTemplateId(PatientLocationInVehicle patientLocationInVehicle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientLocationInVehiclePatientLocationInVehicleTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehiclePatientLocationInVehicleTemplateId"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientLocationInVehicleMoodCode(PatientLocationInVehicle patientLocationInVehicle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientLocationInVehiclePatientLocationInVehicleMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehiclePatientLocationInVehicleMoodCode"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleCodeP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleCodeP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleCodeP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleCodeP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientLocationInVehicleCodeP(PatientLocationInVehicle patientLocationInVehicle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientLocationInVehiclePatientLocationInVehicleCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehiclePatientLocationInVehicleCodeP"),
						 new Object [] { patientLocationInVehicle }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicleCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicleCodeP", passToken);
				}
				passToken.add(patientLocationInVehicle);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67498-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleCode(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientLocationInVehicleCode(PatientLocationInVehicle patientLocationInVehicle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicleCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientLocationInVehicle)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientLocationInVehiclePatientLocationInVehicleCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_CODE,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehiclePatientLocationInVehicleCode"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17361-9' or value.code = 'LA17362-7' or value.code = 'LA17363-5' or value.code = 'LA17364-3' or value.code = 'LA17365-0' or value.code = 'LA17366-8' or value.code = 'LA17367-6' or value.code = 'LA17368-4' or value.code = 'LA17369-2' or value.code = 'LA17370-0' or value.code = 'LA17371-8' or value.code = 'LA17372-6' or value.code = 'LA17373-4' or value.code = 'LA17374-2' or value.code = 'LA4489-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleValue(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientLocationInVehicleValue(PatientLocationInVehicle patientLocationInVehicle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientLocationInVehiclePatientLocationInVehicleValue","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehiclePatientLocationInVehicleValue"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientLocationInVehicleValueP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleValueP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientLocationInVehicleValueP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Location In Vehicle Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientLocationInVehicleValueP(PatientLocationInVehicle, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientLocationInVehicle The receiving '<em><b>Patient Location In Vehicle</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientLocationInVehicleValueP(PatientLocationInVehicle patientLocationInVehicle,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientLocationInVehiclePatientLocationInVehicleValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_LOCATION_IN_VEHICLE);
			try {
				VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_LOCATION_IN_VEHICLE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientLocationInVehicle)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_LOCATION_IN_VEHICLE__PATIENT_LOCATION_IN_VEHICLE_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("PatientLocationInVehiclePatientLocationInVehicleValueP"),
						 new Object [] { patientLocationInVehicle }));
			}
			 
			return false;
		}
		return true;
	}

} // PatientLocationInVehicleOperations
