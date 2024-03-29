/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSAdvanceDirectivesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Advance Directives Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSAdvanceDirectivesSectionImpl extends SectionImpl implements EMSAdvanceDirectivesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSAdvanceDirectivesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAdvanceDirectivesSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAdvanceDirectivesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAdvanceDirectivesSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAdvanceDirectivesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAdvanceDirectivesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSAdvanceDirectivesSectionOperations.validateEMSAdvanceDirectivesSectionAdvancedDirectiveObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation getAdvancedDirectiveObservation() {
		return EMSAdvanceDirectivesSectionOperations.getAdvancedDirectiveObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAdvanceDirectivesSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSAdvanceDirectivesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSAdvanceDirectivesSectionImpl
