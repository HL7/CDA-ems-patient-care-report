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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition#validateUnitDispositionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitDispositionOperations extends ClinicalStatementOperations {

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
	protected UnitDispositionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitDispositionTemplateId(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionTemplateId(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.196' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitDispositionTemplateId(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionTemplateId(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitDisposition The receiving '<em><b>Unit Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitDispositionTemplateId(UnitDisposition unitDisposition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"UnitDispositionUnitDispositionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_DISPOSITION);
			try {
				VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_DISPOSITION__UNIT_DISPOSITION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("UnitDispositionUnitDispositionTemplateId"),
						 new Object [] { unitDisposition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitDispositionCodeP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionCodeP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitDispositionCodeP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionCodeP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitDisposition The receiving '<em><b>Unit Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitDispositionCodeP(UnitDisposition unitDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"UnitDispositionUnitDispositionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_DISPOSITION);
			try {
				VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_DISPOSITION__UNIT_DISPOSITION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("UnitDispositionUnitDispositionCodeP"),
						 new Object [] { unitDisposition }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitDispositionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitDispositionCodeP", passToken);
				}
				passToken.add(unitDisposition);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitDispositionCode(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionCode(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '100037-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitDispositionCode(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionCode(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitDisposition The receiving '<em><b>Unit Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitDispositionCode(UnitDisposition unitDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.UnitDispositionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(unitDisposition)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"UnitDispositionUnitDispositionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_DISPOSITION);
			try {
				VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_DISPOSITION__UNIT_DISPOSITION_CODE,
						 EmspcrPlugin.INSTANCE.getString("UnitDispositionUnitDispositionCode"),
						 new Object [] { unitDisposition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitDispositionValue(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionValue(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA33304-9' or value.code = 'LA33305-6' or value.code = 'LA33306-4' or value.code = 'LA33307-2' or value.code = 'LA33308-0' or value.code = 'LA33303-1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitDispositionValue(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionValue(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitDisposition The receiving '<em><b>Unit Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitDispositionValue(UnitDisposition unitDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"UnitDispositionUnitDispositionValue","ERROR");
    
  	  
  	  
		if (VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_DISPOSITION);
			try {
				VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_DISPOSITION__UNIT_DISPOSITION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("UnitDispositionUnitDispositionValue"),
						 new Object [] { unitDisposition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitDispositionValueP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionValueP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitDispositionValueP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Disposition Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitDispositionValueP(UnitDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unitDisposition The receiving '<em><b>Unit Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnitDispositionValueP(UnitDisposition unitDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"UnitDispositionUnitDispositionValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.UNIT_DISPOSITION);
			try {
				VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_UNIT_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(unitDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.UNIT_DISPOSITION__UNIT_DISPOSITION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("UnitDispositionUnitDispositionValueP"),
						 new Object [] { unitDisposition }));
			}
			 
			return false;
		}
		return true;
	}

} // UnitDispositionOperations
