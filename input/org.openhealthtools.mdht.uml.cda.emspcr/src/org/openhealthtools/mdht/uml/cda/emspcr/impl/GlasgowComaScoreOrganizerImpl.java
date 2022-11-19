/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowComaScoreOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glasgow Coma Score Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlasgowComaScoreOrganizerImpl extends OrganizerImpl implements GlasgowComaScoreOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowComaScoreOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerComponent414(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent414(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerComponent42(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent42(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerComponent43(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent43(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerComponent44(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent44(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerComponent45(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent45(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowComaScoreOrganizer init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GlasgowComaScoreOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // GlasgowComaScoreOrganizerImpl
