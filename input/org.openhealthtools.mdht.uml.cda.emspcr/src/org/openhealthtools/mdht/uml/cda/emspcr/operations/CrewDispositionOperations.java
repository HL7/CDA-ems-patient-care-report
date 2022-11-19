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

import org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Crew Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition#validateCrewDispositionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrewDispositionOperations extends ClinicalStatementOperations {

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
	protected CrewDispositionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCrewDispositionTemplateId(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionTemplateId(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.198' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateCrewDispositionTemplateId(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionTemplateId(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param crewDisposition The receiving '<em><b>Crew Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCrewDispositionTemplateId(CrewDisposition crewDisposition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CrewDispositionCrewDispositionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CREW_DISPOSITION);
			try {
				VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CREW_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(crewDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CREW_DISPOSITION__CREW_DISPOSITION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CrewDispositionCrewDispositionTemplateId"),
						 new Object [] { crewDisposition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCrewDispositionCode(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionCode(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '100039-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCrewDispositionCode(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionCode(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param crewDisposition The receiving '<em><b>Crew Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCrewDispositionCode(CrewDisposition crewDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CrewDispositionCrewDispositionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CREW_DISPOSITION);
			try {
				VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CREW_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(crewDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CREW_DISPOSITION__CREW_DISPOSITION_CODE,
						 EmspcrPlugin.INSTANCE.getString("CrewDispositionCrewDispositionCode"),
						 new Object [] { crewDisposition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCrewDispositionValue(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionValue(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA33320-5' or value.code = 'LA33319-7' or value.code = 'LA33318-9' or value.code = 'LA33317-1' or value.code = 'LA33316-3' or value.code = 'LA33315-5' or value.code = 'LA33314-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCrewDispositionValue(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionValue(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param crewDisposition The receiving '<em><b>Crew Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCrewDispositionValue(CrewDisposition crewDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CrewDispositionCrewDispositionValue","ERROR");
    
  	  
  	  
		if (VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CREW_DISPOSITION);
			try {
				VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CREW_DISPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(crewDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CREW_DISPOSITION__CREW_DISPOSITION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CrewDispositionCrewDispositionValue"),
						 new Object [] { crewDisposition }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCrewDispositionValueP(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionValueP(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCrewDispositionValueP(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Crew Disposition Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCrewDispositionValueP(CrewDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param crewDisposition The receiving '<em><b>Crew Disposition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCrewDispositionValueP(CrewDisposition crewDisposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"CrewDispositionCrewDispositionValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CREW_DISPOSITION);
			try {
				VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CREW_DISPOSITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(crewDisposition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CREW_DISPOSITION__CREW_DISPOSITION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("CrewDispositionCrewDispositionValueP"),
						 new Object [] { crewDisposition }));
			}
			 
			return false;
		}
		return true;
	}

} // CrewDispositionOperations
