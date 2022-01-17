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
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vehicle Impact Area</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleImpactAreaOperations extends ClinicalStatementOperations {
 
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
	protected VehicleImpactAreaOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.54' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaTemplateId(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVehicleImpactAreaTemplateId(VehicleImpactArea vehicleImpactArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleImpactAreaVehicleImpactAreaTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaVehicleImpactAreaTemplateId"),
						 new Object [] { vehicleImpactArea }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaMoodCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVehicleImpactAreaMoodCode(VehicleImpactArea vehicleImpactArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleImpactAreaVehicleImpactAreaMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaVehicleImpactAreaMoodCode"),
						 new Object [] { vehicleImpactArea }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaCodeP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaCodeP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaCodeP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaCodeP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_IMPACT_AREA_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVehicleImpactAreaCodeP(VehicleImpactArea vehicleImpactArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleImpactAreaVehicleImpactAreaCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_IMPACT_AREA_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_IMPACT_AREA_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaVehicleImpactAreaCodeP"),
						 new Object [] { vehicleImpactArea }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactAreaCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactAreaCodeP", passToken);
				}
				passToken.add(vehicleImpactArea);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67497-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaCode(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVehicleImpactAreaCode(VehicleImpactArea vehicleImpactArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactAreaCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(vehicleImpactArea)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleImpactAreaVehicleImpactAreaCode","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_CODE,
						 EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaVehicleImpactAreaCode"),
						 new Object [] { vehicleImpactArea }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA10137-0' or value.code = 'LA10138-8' or value.code = 'LA10139-6' or value.code = 'LA10140-4' or value.code = 'LA10141-2' or value.code = 'LA13942-0' or value.code = 'LA14557-5' or value.code = 'LA14558-3' or value.code = 'LA6112-2' or value.code = 'LA6113-0' or value.code = 'LA6114-8' or value.code = 'LA6115-5')))";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaValue(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVehicleImpactAreaValue(VehicleImpactArea vehicleImpactArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleImpactAreaVehicleImpactAreaValue","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_VALUE,
						 EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaVehicleImpactAreaValue"),
						 new Object [] { vehicleImpactArea }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleImpactAreaValueP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaValueP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_IMPACT_AREA_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleImpactAreaValueP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleImpactAreaValueP(VehicleImpactArea, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_IMPACT_AREA_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleImpactArea The receiving '<em><b>Vehicle Impact Area</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVehicleImpactAreaValueP(VehicleImpactArea vehicleImpactArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleImpactAreaVehicleImpactAreaValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_IMPACT_AREA_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_IMPACT_AREA);
			try {
				VALIDATE_VEHICLE_IMPACT_AREA_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_IMPACT_AREA_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_IMPACT_AREA_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleImpactArea)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_IMPACT_AREA__VEHICLE_IMPACT_AREA_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("VehicleImpactAreaVehicleImpactAreaValueP"),
						 new Object [] { vehicleImpactArea }));
			}
			 
			return false;
		}
		return true;
	}

} // VehicleImpactAreaOperations